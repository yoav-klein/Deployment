
def call() {
	
	config.files_to_upload.each { file ->
		powershell script: "cp ${file} ${config.copy_to_directory}"
	}
	
}
