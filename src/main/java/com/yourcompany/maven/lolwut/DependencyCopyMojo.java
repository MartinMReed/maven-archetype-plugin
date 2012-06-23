package com.yourcompany.maven.lolwut;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import com.yourcompany.maven.core.JoJoMojoImpl;

/**
 * @goal dependency-copy
 * @phase generate-sources
 */
public final class DependencyCopyMojo extends JoJoMojoImpl {

    @Override
    public final void execute() throws MojoExecutionException, MojoFailureException {

        // not part of the regular lifecycle phases, but you may need to extract dependencies somewhere
        //
        //        try {
        //            DependencyService.extractDependencies( target/processed-sources );
        //        }
        //        catch (Exception e) {
        //            throw new IllegalStateException( e );
        //        }
    }
}
