package PasswordParams.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object PasswordParams_HttpsGithubComUsipovTeamcityTrainingGit : GitVcsRoot({
    uuid = "b2202a11-0f1e-40dc-ae60-d9b5f0acf182"
    extId = "PasswordParams_HttpsGithubComUsipovTeamcityTrainingGit"
    name = "https://github.com/Usipov/teamcity-training.git"
    url = "https://github.com/Usipov/teamcity-training.git"
    authMethod = password {
        userName = "Usipov"
        password = "zxx688a918ef67155109118170e6b41b8bb6b4fa5e96d328d95f2182840cafb5861c186d1bacd7d6014e8a69785980e1bb56bc9ffdc7853b22d"
    }
})
