/**
* editConfigEnv(String env)
* Sets the env in the Jekyll _config.yml file
* env - String Environment (generally prod or dev) for the Jekyll site
**/
def call(String env) {
    def config = readYaml(file:"_config.yml")
    config['env'] = env
    sh "rm _config.yml"
    writeYaml(file:"_config.yml", data:config)
}