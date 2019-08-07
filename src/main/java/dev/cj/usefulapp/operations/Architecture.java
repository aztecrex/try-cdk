package dev.cj.usefulapp.operations;

import software.amazon.awscdk.core.App;

public class Architecture {
    public static void main(final String[] args) {
        App app = new App();

        new FrontendStack(app, "try-cdk-frontend");
        new BackendStack(app, "try-cdk-backend");
        app.synth();
    }
}
