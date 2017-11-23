/**
* updateTestSite(String path, String name)
* Updates the test version of the site (on disk) with the newly built site,
* intended for pushing a website test onto a local web server
* path - String, path to test location
* name - String, name of site (should match directory site is in locally) 
**/
def call(String path, String name) {
    sh "rm -rf $path/$name"
    sh "cp -r $name/ $path/$name"
    sh "chmod 777 -R $path/$name"
}