package dev.cj.usefulapp.operations;

import java.util.HashMap;
import java.util.Map;

import software.amazon.awscdk.core.CfnResource;
import software.amazon.awscdk.core.CfnResourceProps;
import software.amazon.awscdk.core.Construct;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.services.s3.Bucket;

class FrontendStack extends Stack {
    public FrontendStack(final Construct parent, final String name) {
        super(parent, name);

        new Bucket(this, "Content");

        // Cloudfront is not yet supported
        // CfnResourceProps distributionProps = CfnResourceProps.builder().withType("AWS::CloudFront::Distribution")
        //         .withProperties(new HashMap<>()).build();
        // new CfnResource(this, "CDN", distributionProps);

    }
}
