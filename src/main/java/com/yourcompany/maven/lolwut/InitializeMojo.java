package com.yourcompany.maven.lolwut;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import com.yourcompany.maven.core.JoJoMojoImpl;

/**
 * @goal initialize
 * @phase initialize
 */
public final class InitializeMojo extends JoJoMojoImpl {

    @Override
    public final void execute() throws MojoExecutionException, MojoFailureException {

        // http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html
        // 
        // initialize build state, e.g. set properties or create directories.
        // 
    }
}
