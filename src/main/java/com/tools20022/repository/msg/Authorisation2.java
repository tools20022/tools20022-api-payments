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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.FixedAmountOrUnlimited1Choice;
import com.tools20022.repository.entity.OperationThreshold;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Autorisation of the mandate holder.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Authorisation2#MaximumAmountByTransaction
 * Authorisation2.MaximumAmountByTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Authorisation2#MaximumAmountByPeriod
 * Authorisation2.MaximumAmountByPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Authorisation2#MaximumAmountByBulkSubmission
 * Authorisation2.MaximumAmountByBulkSubmission}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.OperationThreshold
 * OperationThreshold}</li>
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
 * "Authorisation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Autorisation of the mandate holder."</li>
 * </ul>
 */
public class Authorisation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Maximum amount allowed by the mandate for each transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FixedAmountOrUnlimited1Choice
	 * FixedAmountOrUnlimited1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold#MaximumAmount
	 * OperationThreshold.MaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Authorisation2 Authorisation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAmtByTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmountByTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount allowed by the mandate for each transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute MaximumAmountByTransaction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Authorisation2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OperationThreshold.MaximumAmount;
			isDerived = false;
			xmlTag = "MaxAmtByTx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmountByTransaction";
			definition = "Maximum amount allowed by the mandate for each transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> FixedAmountOrUnlimited1Choice.mmObject();
		}
	};
	/**
	 * Maximum amount allowed over a specific period of time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MaximumAmountByPeriod1
	 * MaximumAmountByPeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold#MaximumAmount
	 * OperationThreshold.MaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Authorisation2 Authorisation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAmtByPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmountByPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum amount allowed over a specific period of time."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd MaximumAmountByPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Authorisation2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OperationThreshold.MaximumAmount;
			isDerived = false;
			xmlTag = "MaxAmtByPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmountByPeriod";
			definition = "Maximum amount allowed over a specific period of time.";
			minOccurs = 0;
			type_lazy = () -> MaximumAmountByPeriod1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies the maximum amount for each bulk submission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FixedAmountOrUnlimited1Choice
	 * FixedAmountOrUnlimited1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold#MaximumAmount
	 * OperationThreshold.MaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Authorisation2 Authorisation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAmtByBlkSubmissn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmountByBulkSubmission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the maximum amount for each  bulk submission."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute MaximumAmountByBulkSubmission = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Authorisation2.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.OperationThreshold.MaximumAmount;
			isDerived = false;
			xmlTag = "MaxAmtByBlkSubmissn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmountByBulkSubmission";
			definition = "Specifies the maximum amount for each  bulk submission.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> FixedAmountOrUnlimited1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Authorisation2.MaximumAmountByTransaction, com.tools20022.repository.msg.Authorisation2.MaximumAmountByPeriod,
						com.tools20022.repository.msg.Authorisation2.MaximumAmountByBulkSubmission);
				trace_lazy = () -> OperationThreshold.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Authorisation2";
				definition = "Autorisation of the mandate holder.";
			}
		});
		return mmObject_lazy.get();
	}
}