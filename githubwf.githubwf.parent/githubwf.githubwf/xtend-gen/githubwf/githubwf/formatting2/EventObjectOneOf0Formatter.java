/**
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.formatting2;

import com.google.inject.Inject;
import githubwf.EventObjectOneOf0;
import githubwf.EventObjectOneOf0AdditionalProperties;
import githubwf.EventObjectOneOf0PropertiesAbstract;
import githubwf.githubwf.services.EventObjectOneOf0GrammarAccess;
import java.util.Arrays;
import jsonMM.JsonDocument;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class EventObjectOneOf0Formatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private EventObjectOneOf0GrammarAccess _eventObjectOneOf0GrammarAccess;

  protected void _format(final EventObjectOneOf0 eventObjectOneOf0, @Extension final IFormattableDocument document) {
    EList<EventObjectOneOf0PropertiesAbstract> _eventObject = eventObjectOneOf0.getEventObject();
    for (final EventObjectOneOf0PropertiesAbstract eventObjectOneOf0PropertiesAbstract : _eventObject) {
      document.<EventObjectOneOf0PropertiesAbstract>format(eventObjectOneOf0PropertiesAbstract);
    }
  }

  protected void _format(final EventObjectOneOf0AdditionalProperties eventObjectOneOf0AdditionalProperties, @Extension final IFormattableDocument document) {
    document.<JsonDocument>format(eventObjectOneOf0AdditionalProperties.getAdditionalProperties());
  }

  public void format(final Object eventObjectOneOf0AdditionalProperties, final IFormattableDocument document) {
    if (eventObjectOneOf0AdditionalProperties instanceof XtextResource) {
      _format((XtextResource)eventObjectOneOf0AdditionalProperties, document);
      return;
    } else if (eventObjectOneOf0AdditionalProperties instanceof EventObjectOneOf0AdditionalProperties) {
      _format((EventObjectOneOf0AdditionalProperties)eventObjectOneOf0AdditionalProperties, document);
      return;
    } else if (eventObjectOneOf0AdditionalProperties instanceof EventObjectOneOf0) {
      _format((EventObjectOneOf0)eventObjectOneOf0AdditionalProperties, document);
      return;
    } else if (eventObjectOneOf0AdditionalProperties instanceof EObject) {
      _format((EObject)eventObjectOneOf0AdditionalProperties, document);
      return;
    } else if (eventObjectOneOf0AdditionalProperties == null) {
      _format((Void)null, document);
      return;
    } else if (eventObjectOneOf0AdditionalProperties != null) {
      _format(eventObjectOneOf0AdditionalProperties, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(eventObjectOneOf0AdditionalProperties, document).toString());
    }
  }
}
