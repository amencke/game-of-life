println "Hello, this is Jenkins calling! This build is running with the following system properties:"
System.properties.each {
	println it
}
