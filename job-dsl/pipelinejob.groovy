pipelineJob('Create ELK') {
    definition {
        cps {
            script(readFileFromWorkspace('project-a-workflow.groovy'))
            sandbox()
        }
    }
}
