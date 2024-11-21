def gitDownload(repo)
{
 git "https://github.com/vamsi-chinnodu/${repo}.git"
}
def buildArtifact()
{
 sh "mvn package"
}
