package com.github.dariachembrovskaya.test1.services

import com.github.dariachembrovskaya.test1.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
