def gitDownload(repo)
{
  git "https://github.com/vamsi-chinnodu/${repo}.git"
}
def buildartfact()
{
   sh "mvn package"
}
