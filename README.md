# Example to use Web3j-unit to test against docker-compose file

Contains a simple test with required dependencies for you to get started with web3j-unit testing with custom docker-compose file.

Web3j-unit is a [Junit 5](https://junit.org/junit5/docs/current/user-guide/) extension to streamline the creation of Ethereum contract tests.

## Usage

This example runs `Greeter` contract against a network of VMWare Concord nodes defined using a `docker-compose` file.

To get started, we need to build the images of Concord locally. 

Once you have Docker installed, checkout the Concord repository:

```shell script
git clone https://github.com/vmware/concord.git
```

After that, from the Concord directory, run the build script for the Docker images:

```shell script
cd concord
docker/build.images.sh
```

You’re we are ready to test using Concord.

