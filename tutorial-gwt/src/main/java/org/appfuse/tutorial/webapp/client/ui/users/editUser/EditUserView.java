package org.appfuse.tutorial.webapp.client.ui.users.editUser;

import java.util.List;

import org.appfuse.tutorial.webapp.client.application.base.view.ProxyEditView;
import org.appfuse.tutorial.webapp.client.proxies.LabelValueProxy;
import org.appfuse.tutorial.webapp.client.proxies.RoleProxy;
import org.appfuse.tutorial.webapp.client.proxies.UserProxy;

public interface EditUserView extends ProxyEditView<UserProxy, EditUserView> {

    interface Delegate extends ProxyEditView.Delegate {

        void updatePasswordClicked();

    }

    void setCountries(List<LabelValueProxy> countries);

    void setAvailableRoles(List<RoleProxy> roles);
}