package PasswordParams

import PasswordParams.buildTypes.*
import PasswordParams.vcsRoots.*
import PasswordParams.vcsRoots.PasswordParams_HttpsGithubComUsipovTeamcityTrainingGit
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "9f2bc927-3e28-4e4f-938c-04aaba3d35da"
    extId = "PasswordParams"
    parentId = "_Root"
    name = "PasswordParams"

    vcsRoot(PasswordParams_HttpsGithubComUsipovTeamcityTrainingGit)

    buildType(PasswordParams_Sample)

    features {
        versionedSettings {
            id = "PROJECT_EXT_1"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = PasswordParams_HttpsGithubComUsipovTeamcityTrainingGit.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            param("credentialsStorageType", "credentialsJSON")
        }
    }
})
