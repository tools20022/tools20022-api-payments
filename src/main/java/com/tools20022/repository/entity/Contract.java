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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.ContractClosureReason1Choice;
import com.tools20022.repository.choice.UnderlyingContract1Choice;
import com.tools20022.repository.entity.Agreement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Document that contains the information of the contract agreed between both
 * parties.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Contract" src="doc-files/Contract.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Contract#mmMasterAgreement
 * Contract.mmMasterAgreement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.UnderlyingContract1Choice
 * UnderlyingContract1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1
 * TransactionCertificateContract1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeContract1 TradeContract1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ContractClosureReason1Choice
 * ContractClosureReason1Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MasterAgreement#mmGovernedContract
 * MasterAgreement.mmGovernedContract}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract4#mmContract
 * RegisteredContract4.mmContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionCertificateRecord1#mmContract
 * TransactionCertificateRecord1.mmContract}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract5#mmContract
 * RegisteredContract5.mmContract}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RegisteredContract3#mmContract
 * RegisteredContract3.mmContract}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Agreement
 * Agreement}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract
 * AccountContract}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RegisteredContract
 * RegisteredContract}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Contract"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Document that contains the information of the contract agreed between both parties."
 * </li>
 * </ul>
 */
public class Contract extends Agreement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.MasterAgreement> masterAgreement;
	/**
	 * Agreement that governs a contract agreed between parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement#mmGovernedContract
	 * MasterAgreement.mmGovernedContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Contract
	 * Contract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement that governs a contract agreed between  parties."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMasterAgreement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Contract.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MasterAgreement";
			definition = "Agreement that governs a contract agreed between  parties.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MasterAgreement.mmGovernedContract;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MasterAgreement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Contract";
				definition = "Document that contains the information of the contract agreed between both parties.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MasterAgreement.mmGovernedContract);
				derivationElement_lazy = () -> Arrays.asList(RegisteredContract4.mmContract, TransactionCertificateRecord1.mmContract, RegisteredContract5.mmContract, RegisteredContract3.mmContract);
				subType_lazy = () -> Arrays.asList(AccountContract.mmObject(), Mandate.mmObject(), RegisteredContract.mmObject());
				superType_lazy = () -> Agreement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Contract.mmMasterAgreement);
				derivationComponent_lazy = () -> Arrays.asList(UnderlyingContract1Choice.mmObject(), TransactionCertificateContract1.mmObject(), TradeContract1.mmObject(), ContractClosureReason1Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Contract.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<MasterAgreement> getMasterAgreement() {
		return masterAgreement;
	}

	public void setMasterAgreement(List<com.tools20022.repository.entity.MasterAgreement> masterAgreement) {
		this.masterAgreement = masterAgreement;
	}
}