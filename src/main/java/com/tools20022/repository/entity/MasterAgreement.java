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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.AgreementFrameworkCode;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.entity.Agreement;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Agreement which defines the framework of a contract between two trading
 * parties in different domains such as collateral, derivatives, trade..
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MasterAgreement" src="doc-files/MasterAgreement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MasterAgreement#CollateralAgreement
 * MasterAgreement.CollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MasterAgreement#MasterAgreementType
 * MasterAgreement.MasterAgreementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MasterAgreement#GovernedTrades
 * MasterAgreement.GovernedTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MasterAgreement#GovernedContract
 * MasterAgreement.GovernedContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MasterAgreement#GoverningLaw
 * MasterAgreement.GoverningLaw}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#GoverningDocument
 * Trade.GoverningDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Contract#MasterAgreement
 * Contract.MasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#AssociatedMasterAgreement
 * CollateralAgreement.AssociatedMasterAgreement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Agreement
 * Agreement}</li>
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
 * "MasterAgreement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Agreement which defines the framework of a contract between two trading parties in different domains such as collateral, derivatives, trade.."
 * </li>
 * </ul>
 */
public class MasterAgreement extends Agreement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Collateral agreement which is governed by the related master agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#AssociatedMasterAgreement
	 * CollateralAgreement.AssociatedMasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral agreement which is governed by the related master agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralAgreement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MasterAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAgreement";
			definition = "Collateral agreement which is governed by the related master agreement.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.AssociatedMasterAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Nature of the agreement, eg, ISDA Master Agreement or bilateral
	 * agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AgreementFrameworkCode
	 * AgreementFrameworkCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterAgreementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Nature of the agreement, eg, ISDA Master Agreement or bilateral agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MasterAgreementType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MasterAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MasterAgreementType";
			definition = "Nature of the agreement, eg, ISDA Master Agreement or bilateral agreement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AgreementFrameworkCode.mmObject();
		}
	};
	/**
	 * Trades to which the master agreement applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#GoverningDocument
	 * Trade.GoverningDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernedTrades"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trades to which the master agreement applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd GovernedTrades = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MasterAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GovernedTrades";
			definition = "Trades to which the master agreement applies.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.GoverningDocument;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Contract which is governed by the master agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Contract#MasterAgreement
	 * Contract.MasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Contract Contract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernedContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract which is governed by the master agreement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd GovernedContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> MasterAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GovernedContract";
			definition = "Contract which is governed by the master agreement.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Contract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Contract.MasterAgreement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * National law under which a non-deliverable contract has been agreed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoverningLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "National law under which a non-deliverable contract has been agreed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GoverningLaw = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> MasterAgreement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GoverningLaw";
			definition = "National law under which a non-deliverable contract has been agreed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MasterAgreement";
				definition = "Agreement which defines the framework of a contract between two trading parties in different domains such as collateral, derivatives, trade..";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.GoverningDocument, com.tools20022.repository.entity.Contract.MasterAgreement,
						com.tools20022.repository.entity.CollateralAgreement.AssociatedMasterAgreement);
				superType_lazy = () -> Agreement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MasterAgreement.CollateralAgreement, com.tools20022.repository.entity.MasterAgreement.MasterAgreementType,
						com.tools20022.repository.entity.MasterAgreement.GovernedTrades, com.tools20022.repository.entity.MasterAgreement.GovernedContract, com.tools20022.repository.entity.MasterAgreement.GoverningLaw);
			}
		});
		return mmObject_lazy.get();
	}
}