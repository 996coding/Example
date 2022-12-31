task=":app:assemble"
./gradlew clean $task
echo '---------------------- build finished --------------------------'
rootDir=$(cd $(dirname $0);pwd)
libsDir=$(cd ${rootDir};cd ./RemoteJar/build/libs;pwd)
javaJar="${libsDir}/RemoteJar.jar"
dexJar="${rootDir}/download/RemoteJar.jar"

echo "$libsDir"
echo "$javaJar"
echo "$dexJar"

dx --dex --output="$dexJar" "$javaJar"
echo '---------------------- dex finished --------------------------'
