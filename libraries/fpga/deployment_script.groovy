
def call() {
	
	config.files_to_upload.each { file ->
		powershell script: "echo ${file} "
	}
	
}
