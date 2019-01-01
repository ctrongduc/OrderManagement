package com.amkat.ordermanager.web.screens;

import java.util.UUID;

import javax.inject.Inject;

import com.amkat.ordermanager.entity.Customer;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Action.Status;
import com.haulmont.cuba.gui.components.DialogAction;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.data.CollectionDatasource;

public class Customerscreen extends AbstractWindow {
	
	@Inject
	private CollectionDatasource<Customer, UUID> customersDs;
	
	@Inject
	private Table<Customer> customers;

    public void onAddCustomerClick() {
    	Customer item = new Customer();
    	customersDs.addItem(item);
    	customers.setEditable(true);
    }

    public void onEditCustomerClick() {
    	customers.setEditable(true);
    }

    public void onOpenOrdersClick() {
    	
    }

    public void onSaveEditClick() {
    	customersDs.commit();
    	customers.setEditable(false);
    }

    public void onCancelEditClick() {
    	showOptionDialog(
    		    getMessage("customerConfirmCancel.title"),
    		    getMessage("customerConfirmCancel.message"),
    		    MessageType.CONFIRMATION,
    		    new Action[] {
    		        new DialogAction(DialogAction.Type.YES, Status.PRIMARY).withHandler(e -> cancelEdit()),
    		        new DialogAction(DialogAction.Type.NO, Status.NORMAL)
    		    }
    		);
    }
    
    private void cancelEdit() {
    	customersDs.revert();
    	customers.setEditable(false);
    }
}