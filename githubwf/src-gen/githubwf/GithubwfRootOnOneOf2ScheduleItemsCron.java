/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Schedule Items Cron</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2ScheduleItemsCron#getCron <em>Cron</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2ScheduleItemsCron()
 * @model annotation="Type Type='string'"
 *        annotation="Comment Comment='https://stackoverflow.com/a/57639657/4044345'"
 * @generated
 */
public interface GithubwfRootOnOneOf2ScheduleItemsCron extends GithubwfRootOnOneOf2ScheduleItemsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Cron</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cron</em>' attribute.
	 * @see #setCron(String)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2ScheduleItemsCron_Cron()
	 * @model required="true"
	 *        annotation="Keyword Keyword='cron'"
	 * @generated
	 */
	String getCron();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2ScheduleItemsCron#getCron <em>Cron</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cron</em>' attribute.
	 * @see #getCron()
	 * @generated
	 */
	void setCron(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean regexMatch();

} // GithubwfRootOnOneOf2ScheduleItemsCron
