println "Hello, this is Jenkins calling! This build is running with the following system properties:\n"
System.properties.each {
	println it
}
