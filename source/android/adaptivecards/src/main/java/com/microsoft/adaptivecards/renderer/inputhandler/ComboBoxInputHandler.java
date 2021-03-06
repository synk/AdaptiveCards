package com.microsoft.adaptivecards.renderer.inputhandler;

import android.widget.Spinner;

import com.microsoft.adaptivecards.objectmodel.BaseInputElement;
import com.microsoft.adaptivecards.objectmodel.ChoiceSetInput;

import java.text.ParseException;
import java.util.Map;

/**
 * Created by bekao on 7/5/2017.
 */

public class ComboBoxInputHandler extends BaseInputHandler
{
    public ComboBoxInputHandler(BaseInputElement baseInputElement)
    {
        super(baseInputElement);
    }

    protected Spinner getSpinner()
    {
        return (Spinner) m_view;
    }

    @Override
    protected void setDefaultTextColor()
    {
        //no op
    }

    @Override
    protected void setInvalidTextColor()
    {
        // no op
    }

    @Override
    protected void internalValidate()
            throws ParseException
    {
        // no need to validate
    }

    public Exception getData(Map<String, String> data)
    {
        // no need to validate
        ChoiceSetInput choiceSetInput = (ChoiceSetInput) m_baseInputElement;
        data.put(m_baseInputElement.GetId(), (String) getSpinner().getSelectedItem());
        return null;
    }
}
