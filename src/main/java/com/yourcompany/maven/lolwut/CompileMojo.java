package com.yourcompany.maven.lolwut;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import com.yourcompany.maven.core.JoJoMojoImpl;

/**
 * @goal compile
 * @phase compile
 */
public final class CompileMojo extends JoJoMojoImpl {

    @Override
    public final void execute() throws MojoExecutionException, MojoFailureException {

        // http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html
        // 
        // compile the source code of the project.
        // 
    }
}
