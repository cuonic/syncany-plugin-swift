package org.syncany.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.syncany.tests.cli.DownCommandTest;
import org.syncany.tests.cli.LogCommandTest;
import org.syncany.tests.cli.LsRemoteCommandTest;
import org.syncany.tests.cli.StatusCommandTest;
import org.syncany.tests.cli.SyncCommandTest;
import org.syncany.tests.cli.UpCommandTest;
import org.syncany.tests.cli.CommandLineInterfaceTest;
import org.syncany.tests.cli.WatchCommandTest;

@RunWith(Suite.class)
@SuiteClasses({
	CommandLineInterfaceTest.class,
	DownCommandTest.class,
	LogCommandTest.class,
	LsRemoteCommandTest.class,
	StatusCommandTest.class,
	SyncCommandTest.class,
	UpCommandTest.class,	
	WatchCommandTest.class
})
public class CliTests {
	// This class executes all tests
}
