package PasswordParams.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object PasswordParams_Sample : BuildType({
    uuid = "e949852c-e934-4146-ad86-6328cfb72b2e"
    extId = "PasswordParams_Sample"
    name = "Sample"

    params {
        password("my custom secured parameter", "credentialsJSON:920f2199-1d7a-4983-a7ca-3c8db8cd8aeb")
    }

    vcs {
        root(PasswordParams.vcsRoots.PasswordParams_HttpsGithubComUsipovTeamcityTrainingGit)

    }

    steps {
        script {
            scriptContent = """
                echo %system.teamcity.auth.password%
                echo %my custom secured parameter%
            """.trimIndent()
        }
    }
})
