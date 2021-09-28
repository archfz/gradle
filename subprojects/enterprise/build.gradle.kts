plugins {
    id("gradlebuild.distribution.api-java")
}

dependencies {
    api(project(":base-services")) // leaks BuildOperationNotificationListener on API

    implementation(libs.inject)
    implementation(libs.jsr305)
    implementation(libs.guava)
    implementation(project(":build-option"))
    implementation(project(":core"))
    implementation(project(":core-api"))
    implementation(project(":file-collections"))
    implementation(project(":launcher"))
    implementation(project(":logging"))
    implementation(project(":model-core"))
    implementation(project(":snapshots"))
    implementation(project(":testing-base"))
    implementation(project(":testing-jvm"))

    integTestImplementation(project(":internal-testing"))
    integTestImplementation(project(":internal-integ-testing"))

    // Dependencies of the integ test fixtures
    integTestImplementation(project(":build-option"))
    integTestImplementation(project(":messaging"))
    integTestImplementation(project(":persistent-cache"))
    integTestImplementation(project(":native"))
    integTestImplementation(libs.guava)

    integTestDistributionRuntimeOnly(project(":distributions-full"))
}
