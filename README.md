## Multi-Stage Docker Build
Multi stage docker files save a lot of disk space, efficient and secure.

In a docker file, base images, their dependencies has a lot of overload, demanding more space

But for any application stack, the run time is all we need for execution

In multi stage build, the binary is borrowed in the dockerfile

Here is a difference between two dockerfiles, where one is built using multi-stage build, and the other with single-stage.

![file](https://github.com/guycalledavinash/multistage-docker/assets/90386560/2bdeddd3-c780-4f68-b3f0-96f2b43e0ecb)
