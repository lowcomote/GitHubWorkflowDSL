/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Registry package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Registry_package#getRegistry_package <em>Registry package</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Registry_package()
 * @model annotation="Description Description='Runs your workflow anytime a package is published or updated. For more information, see https://help.github.com/en/github/managing-packages-with-github-packages.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/reference/events-that-trigger-workflows#registry-package-event-registry_package'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Registry_package extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Registry package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry package</em>' containment reference.
	 * @see #setRegistry_package(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Registry_package_Registry_package()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='registry_package'"
	 * @generated
	 */
	EventObject getRegistry_package();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Registry_package#getRegistry_package <em>Registry package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry package</em>' containment reference.
	 * @see #getRegistry_package()
	 * @generated
	 */
	void setRegistry_package(EventObject value);

} // GithubwfRootOnOneOf2Registry_package
