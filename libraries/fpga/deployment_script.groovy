
def call() {
	config.files_to_upload.each { file ->
		node {
			powershell script: "echo ${file} "
		}
	}
	
}
