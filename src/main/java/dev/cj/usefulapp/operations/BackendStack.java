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

        // Code handleOpCode = Code.bucket(codeBucket, handleOpKey);
        Code handleOpCode = Code.asset("op-handler");
        FunctionProps handleOpProps = FunctionProps.builder().withHandler("index.handle")
                .withRuntime(Runtime.NODEJS_10_X).withCode(handleOpCode).build();
        new Function(this, "HandleOp", handleOpProps);

        // // API Gateway not yet supported
        // CfnResourceProps apiProps =
        // CfnResourceProps.builder().withType("AWS::ApiGateway::Api")
        // .withProperties(new HashMap<>()).build();
        // new CfnResource(this, "Api", apiProps);

        // CfnResourceProps resourceProps =
        // CfnResourceProps.builder().withType("AWS::ApiGateway::Resource")
        // .withProperties(new HashMap<>()).build();
        // new CfnResource(this, "Op", resourceProps);

        // CfnResourceProps methodProps =
        // CfnResourceProps.builder().withType("AWS::ApiGateway::Method")
        // .withProperties(new HashMap<>()).build();
        // new CfnResource(this, "PostOp", methodProps);
        // // etc....

    }
}
