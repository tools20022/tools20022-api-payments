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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.msg.CardAggregated1;
import com.tools20022.repository.msg.CardIndividualTransaction2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice between a acquirer globalised card transaction or an individual card
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardTransaction2Choice#Aggregated
 * CardTransaction2Choice.Aggregated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CardTransaction2Choice#Individual
 * CardTransaction2Choice.Individual}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
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
 * "CardTransaction2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a acquirer globalised card transaction or an individual card transaction."
 * </li>
 * </ul>
 */
public class CardTransaction2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Card transaction details, based on card transaction aggregated data
	 * performed by the card acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAggregated1
	 * CardAggregated1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CardTransaction2Choice
	 * CardTransaction2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Aggtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aggregated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card transaction details, based on card transaction aggregated data performed by the card acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Aggregated = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardTransaction2Choice.mmObject();
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			xmlTag = "Aggtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Aggregated";
			definition = "Card transaction details, based on card transaction aggregated data performed by the card acquirer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CardAggregated1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Card transaction details for the individual transaction, as recorded at
	 * the POI (point of interaction).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CardTransaction2Choice
	 * CardTransaction2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Indv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Individual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card transaction details for the individual transaction, as recorded at the POI (point of interaction)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Individual = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardTransaction2Choice.mmObject();
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			isDerived = false;
			xmlTag = "Indv";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Individual";
			definition = "Card transaction details for the individual transaction, as recorded at the POI (point of interaction).";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CardIndividualTransaction2.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CardTransaction2Choice.Aggregated, com.tools20022.repository.choice.CardTransaction2Choice.Individual);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardTransaction2Choice";
				definition = "Choice between a acquirer globalised card transaction or an individual card transaction.";
			}
		});
		return mmObject_lazy.get();
	}
}