
libraries {
    fpga {
        files_to_upload = ["products/prod1", "products/prod2"]
        copy_to_directory = "artifacts"
    }
    deployment {
        artifact = "BOOT.BIN"
    }
}
