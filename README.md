# dexresizer

Limit the number of fields/methods/etc. to a certain amount. Useful for avoiding the 65535 problem during subsequent instrumentation on the dex files.

## Build

```shell
./gradlew installDist
```

## Run

```shell
build/install/dexresizer/bin/dexresizer <in dex directory> <out dex directory>
```

