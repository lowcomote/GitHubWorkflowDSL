/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Schedule#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Schedule()
 * @model annotation="Type Type='array'"
 *        annotation="Description Description='You can schedule a workflow to run at specific UTC times using POSIX cron syntax (https://pubs.opengroup.org/onlinepubs/9699919799/utilities/crontab.html#tag_20_25_07). Scheduled workflows run on the latest commit on the default or base branch. The shortest interval you can run scheduled workflows is once every 5 minutes.\nNote: GitHub Actions does not support the non-standard syntax @yearly, @monthly, @weekly, @daily, @hourly, and @reboot.\nYou can use crontab guru (https://crontab.guru/). to help generate your cron syntax and confirm what time it will run. To help you get started, there is also a list of crontab guru examples (https://crontab.guru/examples.html).'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#scheduled-events-schedule'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Schedule extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootOnOneOf2ScheduleItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Schedule_Schedule()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='schedule'"
	 * @generated
	 */
	EList<GithubwfRootOnOneOf2ScheduleItems> getSchedule();

} // GithubwfRootOnOneOf2Schedule
