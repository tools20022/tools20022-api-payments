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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FixedAmountOrUnlimited1Choice;
import com.tools20022.repository.entity.OperationThreshold;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.Authorisation2#mmMaximumAmountByTransaction
 * Authorisation2.mmMaximumAmountByTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Authorisation2#mmMaximumAmountByPeriod
 * Authorisation2.mmMaximumAmountByPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Authorisation2#mmMaximumAmountByBulkSubmission
 * Authorisation2.mmMaximumAmountByBulkSubmission}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Authorisation2", propOrder = {"maximumAmountByTransaction", "maximumAmountByPeriod", "maximumAmountByBulkSubmission"})
public class Authorisation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MaxAmtByTx")
	protected FixedAmountOrUnlimited1Choice maximumAmountByTransaction;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold#mmMaximumAmount
	 * OperationThreshold.mmMaximumAmount}</li>
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
	public static final MMMessageAttribute mmMaximumAmountByTransaction = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OperationThreshold.mmMaximumAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Authorisation2.mmObject();
			isDerived = false;
			xmlTag = "MaxAmtByTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmountByTransaction";
			definition = "Maximum amount allowed by the mandate for each transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FixedAmountOrUnlimited1Choice.mmObject();
		}
	};
	@XmlElement(name = "MaxAmtByPrd")
	protected List<com.tools20022.repository.msg.MaximumAmountByPeriod1> maximumAmountByPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MaximumAmountByPeriod1
	 * MaximumAmountByPeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold#mmMaximumAmount
	 * OperationThreshold.mmMaximumAmount}</li>
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
	public static final MMMessageAssociationEnd mmMaximumAmountByPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> OperationThreshold.mmMaximumAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Authorisation2.mmObject();
			isDerived = false;
			xmlTag = "MaxAmtByPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmountByPeriod";
			definition = "Maximum amount allowed over a specific period of time.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MaximumAmountByPeriod1.mmObject();
		}
	};
	@XmlElement(name = "MaxAmtByBlkSubmissn")
	protected FixedAmountOrUnlimited1Choice maximumAmountByBulkSubmission;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.OperationThreshold#mmMaximumAmount
	 * OperationThreshold.mmMaximumAmount}</li>
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
	public static final MMMessageAttribute mmMaximumAmountByBulkSubmission = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OperationThreshold.mmMaximumAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Authorisation2.mmObject();
			isDerived = false;
			xmlTag = "MaxAmtByBlkSubmissn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAmountByBulkSubmission";
			definition = "Specifies the maximum amount for each  bulk submission.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FixedAmountOrUnlimited1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Authorisation2.mmMaximumAmountByTransaction, com.tools20022.repository.msg.Authorisation2.mmMaximumAmountByPeriod,
						com.tools20022.repository.msg.Authorisation2.mmMaximumAmountByBulkSubmission);
				trace_lazy = () -> OperationThreshold.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Authorisation2";
				definition = "Autorisation of the mandate holder.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FixedAmountOrUnlimited1Choice> getMaximumAmountByTransaction() {
		return maximumAmountByTransaction == null ? Optional.empty() : Optional.of(maximumAmountByTransaction);
	}

	public Authorisation2 setMaximumAmountByTransaction(FixedAmountOrUnlimited1Choice maximumAmountByTransaction) {
		this.maximumAmountByTransaction = maximumAmountByTransaction;
		return this;
	}

	public List<MaximumAmountByPeriod1> getMaximumAmountByPeriod() {
		return maximumAmountByPeriod == null ? maximumAmountByPeriod = new ArrayList<>() : maximumAmountByPeriod;
	}

	public Authorisation2 setMaximumAmountByPeriod(List<com.tools20022.repository.msg.MaximumAmountByPeriod1> maximumAmountByPeriod) {
		this.maximumAmountByPeriod = Objects.requireNonNull(maximumAmountByPeriod);
		return this;
	}

	public Optional<FixedAmountOrUnlimited1Choice> getMaximumAmountByBulkSubmission() {
		return maximumAmountByBulkSubmission == null ? Optional.empty() : Optional.of(maximumAmountByBulkSubmission);
	}

	public Authorisation2 setMaximumAmountByBulkSubmission(FixedAmountOrUnlimited1Choice maximumAmountByBulkSubmission) {
		this.maximumAmountByBulkSubmission = maximumAmountByBulkSubmission;
		return this;
	}
}