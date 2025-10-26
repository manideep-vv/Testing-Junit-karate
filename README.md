# Testing-Junit-karate
this contains junit code and karate code




1

2

gradle tet

karate.txt

Feature, files can read the payload from data file like below

And request read('classpath:data/total-exposure-request.json')

variable delcared in karate-config.js can e used in

1) karate-config.js file will be executed for each and every scenario

file name should have same лате

here we should write a function that shouldreturn map object, we can directly use those map keys in feaure file

2) u can even call js function and get the response

header X-REQUEST-ID = call read('classpath: functions/generate-uuid.js')

Hote

Function fn(){

var UUID Java.type("java.util.UUID"); return UUID.randomUUID();

the value for configurations can be passed from 1) Test runner or 2) from command line

System.setProperty("karate.env", "dev") or setting properties programatically using karaté runner from junit example from spring context whatever we got we Huoner systemProperty (KARATE_SERVER_PORT, localServerPort)

b) pass from mvn or gradle command

gradle :bdd:test -Dkarate.env="dev" (now in this case we can pass karate variables, if we pass others if will be for m

fetching from config file

var localTestsServerPort = karate.properties['karate.localTestsServerPort']

exec flow

Runner file will execute spring container then  karate-config.js for every feature and then every scenario

31