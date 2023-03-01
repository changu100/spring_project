rootProject.name = "demo"
include("resource")
include("application")
include("presentation")
include("domain")
include("root")
include("apps")
include("apps")
include("apps:videostreaming")
findProject(":apps:videostreaming")?.name = "videostreaming"
