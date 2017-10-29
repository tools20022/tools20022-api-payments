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
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.msg.BillingMethod1;
import com.tools20022.repository.msg.BillingMethod2;
import com.tools20022.repository.msg.BillingMethod3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice between tax calculation methods A, B or D.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice#MethodA
 * BillingMethod1Choice.MethodA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice#MethodB
 * BillingMethod1Choice.MethodB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice#MethodD
 * BillingMethod1Choice.MethodD}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
 * "BillingMethod1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between tax calculation methods A, B or D."</li>
 * </ul>
 */
public class BillingMethod1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tax values are based on tax calculation method A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingMethod1
	 * BillingMethod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice
	 * BillingMethod1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtdA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MethodA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax values are based on tax calculation method A."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd MethodA = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingMethod1Choice.mmObject();
			businessComponentTrace_lazy = () -> Tax.mmObject();
			isDerived = false;
			xmlTag = "MtdA";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MethodA";
			definition = "Tax values are based on tax calculation method A.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BillingMethod1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Tax values are based on tax calculation method B.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingMethod2
	 * BillingMethod2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice
	 * BillingMethod1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtdB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MethodB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax values are based on tax calculation method B."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd MethodB = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingMethod1Choice.mmObject();
			businessComponentTrace_lazy = () -> Tax.mmObject();
			isDerived = false;
			xmlTag = "MtdB";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MethodB";
			definition = "Tax values are based on tax calculation method B.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BillingMethod2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Tax values are based on tax calculation method D.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingMethod3
	 * BillingMethod3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice
	 * BillingMethod1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtdD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MethodD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax values are based on tax calculation method D."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd MethodD = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingMethod1Choice.mmObject();
			businessComponentTrace_lazy = () -> Tax.mmObject();
			isDerived = false;
			xmlTag = "MtdD";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MethodD";
			definition = "Tax values are based on tax calculation method D.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BillingMethod3.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BillingMethod1Choice.MethodA, com.tools20022.repository.choice.BillingMethod1Choice.MethodB,
						com.tools20022.repository.choice.BillingMethod1Choice.MethodD);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BillingMethod1Choice";
				definition = "Choice between tax calculation methods A, B or D.";
			}
		});
		return mmObject_lazy.get();
	}
}