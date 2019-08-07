package dev.cj.usefulapp.operations;

import software.amazon.awscdk.core.Construct;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.services.lambda.Code;
import software.amazon.awscdk.services.lambda.Function;
import software.amazon.awscdk.services.lambda.FunctionProps;
import software.amazon.awscdk.services.lambda.Runtime;

class BackendStack extends Stack {
    public BackendStack(final Construct parent, final String name) {
        super(parent, name);

        final Code handleOpCode = Code.asset("op-handler");
        final FunctionProps handleOpProps = FunctionProps.builder().withHandler("index.handle")
                .withRuntime(Runtime.NODEJS_10_X).withCode(handleOpCode).build();
        new Function(this, "HandleOp", handleOpProps);

        // // API Gateway not yet supported
        // final CfnResourceProps apiProps = CfnResourceProps.builder().withType("AWS::ApiGateway::Api")
        //         .withProperties(new HashMap<>()).build();
        // new CfnResource(this, "Api", apiProps);

        // final CfnResourceProps resourceProps = CfnResourceProps.builder().withType("AWS::ApiGateway::Resource")
        //         .withProperties(new HashMap<>()).build();
        // new CfnResource(this, "Op", resourceProps);

        // final CfnResourceProps methodProps = CfnResourceProps.builder().withType("AWS::ApiGateway::Method")
        //         .withProperties(new HashMap<>()).build();
        // new CfnResource(this, "PostOp", methodProps);
        // // etc....

    }
}
