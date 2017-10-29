/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether or not the debit authorisation is granted.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation2#DebitAuthorisation
 * DebitAuthorisationConfirmation2.DebitAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation2#AmountToDebit
 * DebitAuthorisationConfirmation2.AmountToDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation2#ValueDateToDebit
 * DebitAuthorisationConfirmation2.ValueDateToDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation2#Reason
 * DebitAuthorisationConfirmation2.Reason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DebitAuthorisationResponseV03#Confirmation
 * DebitAuthorisationResponseV03.Confirmation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DebitAuthorisationConfirmation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies whether or not the debit authorisation is granted."</li>
 * </ul>
 */
public class DebitAuthorisationConfirmation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Code expressing the decision taken by the account owner relative to the
	 * request for debit authorization.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#DebitAuthorisationDecision
	 * DebitAuthorisation.DebitAuthorisationDecision}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation2
	 * DebitAuthorisationConfirmation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtAuthstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code expressing the decision taken by the account owner relative to the request for debit authorization."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute DebitAuthorisation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DebitAuthorisationConfirmation2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.DebitAuthorisationDecision;
			isDerived = false;
			xmlTag = "DbtAuthstn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitAuthorisation";
			definition = "Code expressing the decision taken by the account owner relative to the request for debit authorization.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Amount of money authorised for debit. Usage: The party approving the
	 * debit may want to authorise the amount less charges and may only be
	 * prepared to approve the debit for value today rather than the original
	 * value date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#AmountToDebit
	 * DebitAuthorisation.AmountToDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation2
	 * DebitAuthorisationConfirmation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtToDbt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountToDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money authorised for debit. \nUsage: The party approving the debit may want to authorise the amount less charges and may only be prepared to approve the debit for value today rather than the original value date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute AmountToDebit = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DebitAuthorisationConfirmation2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.AmountToDebit;
			isDerived = false;
			xmlTag = "AmtToDbt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountToDebit";
			definition = "Amount of money authorised for debit. \nUsage: The party approving the debit may want to authorise the amount less charges and may only be prepared to approve the debit for value today rather than the original value date.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Value date for debiting the amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#ValueDateToDebit
	 * DebitAuthorisation.ValueDateToDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation2
	 * DebitAuthorisationConfirmation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDtToDbt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDateToDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value date for debiting the amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ValueDateToDebit = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DebitAuthorisationConfirmation2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.ValueDateToDebit;
			isDerived = false;
			xmlTag = "ValDtToDbt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDateToDebit";
			definition = "Value date for debiting the amount.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies the reason for the debit authorisation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#Reason
	 * DebitAuthorisation.Reason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationConfirmation2
	 * DebitAuthorisationConfirmation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason for the debit authorisation request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Reason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DebitAuthorisationConfirmation2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DebitAuthorisation.Reason;
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Specifies the reason for the debit authorisation request.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DebitAuthorisationConfirmation2.DebitAuthorisation, com.tools20022.repository.msg.DebitAuthorisationConfirmation2.AmountToDebit,
						com.tools20022.repository.msg.DebitAuthorisationConfirmation2.ValueDateToDebit, com.tools20022.repository.msg.DebitAuthorisationConfirmation2.Reason);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.DebitAuthorisationResponseV03.Confirmation);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DebitAuthorisationConfirmation2";
				definition = "Specifies whether or not the debit authorisation is granted.";
			}
		});
		return mmObject_lazy.get();
	}
}