/**
* editConfigBaseUrl(String baseUrl)
* Sets the baseUrl in the Jekyll _config.yml file
* baseUrl - String baseUrl for the Jekyll site
**/
def call(String baseUrl) {
    def config = readYaml(file:"_config.yml")
    config['baseurl'] = "/ind"
    sh "rm _config.yml"
    writeYaml(file:"_config.yml", data:config)
}