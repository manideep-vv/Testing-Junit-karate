function fn() {
console.log("loading the js file")
  var env = karate.env; // get system property 'karate.env'
  karate.log('karate.env system property was:', env);

  //Fetching other props from command
  var pass=java.lang.System.getProperty("vcap.dbpass")
  console.log("other var from cmd are ", pass)

  java.lang.System.out.println("bro this log is from java sysout")
  if (!env) {
    env = 'dev';
  }
  var config = {
	apiUrl : 'http://localhost:8080/employeeApi/'
  }
  if (env == 'dev') {
  config.usernameFromKarateJs =  'mani'
  config.passwordFromKarateJs = 'santu'
  } else if (env == 'e2e') {
config.usernameFromKarateJs =  'maniv1'
  config.passwordFromKarateJs = 'santuv1'
  }
//  var  accesstoken = karate.callSingle('classpath: bdds/empCrud.feature',config).token
//  karate.configure('headers',{Authorization : 'token'+accesstoken})

  return config;
}