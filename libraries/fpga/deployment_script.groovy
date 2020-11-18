
def call() {
	config.files_to_upload.each { file ->
		
			powershell script: """
				echo "Copying ${file} to ${config.copy_to_directory}
				cp ${file} ${config.copy_to_directory}
			"""
		
	}
	
}
