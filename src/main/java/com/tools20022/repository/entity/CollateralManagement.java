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
import com.tools20022.metamodel.MMBusinessComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of operations relative to the management of collateral, variation
 * margins, default fund participation and independent amount.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CollateralManagement" src="doc-files/CollateralManagement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#CollateralProposal
 * CollateralManagement.CollateralProposal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#CollateralValuation
 * CollateralManagement.CollateralValuation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#FeesAndCommissions
 * CollateralManagement.FeesAndCommissions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#InterestManagement
 * CollateralManagement.InterestManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#DisputeManagement
 * CollateralManagement.DisputeManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#MarginCall
 * CollateralManagement.MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#CollateralSubstitution
 * CollateralManagement.CollateralSubstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#RiskToCover
 * CollateralManagement.RiskToCover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#Collateral
 * CollateralManagement.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#AgreedTerms
 * CollateralManagement.AgreedTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#ClearingSystem
 * CollateralManagement.ClearingSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#CollateralManagement
 * Adjustment.CollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingSystem#CollateralManagement
 * ClearingSystem.CollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralManagement
 * Collateral.CollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#RelatedManagementProcess
 * CollateralValuation.RelatedManagementProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#RiskCoverage
 * CollateralAgreement.RiskCoverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#RelatedManagementProcess
 * MarginCall.RelatedManagementProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralProposal#RelatedManagementProcess
 * CollateralProposal.RelatedManagementProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#RelatedManagementProcess
 * CollateralSubstitution.RelatedManagementProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#CollateralManagement
 * ExposureCalculation.CollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisputeManagement#RelatedManagementProcess
 * DisputeManagement.RelatedManagementProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#CollateralManagement
 * CollateralInterestAdministration.CollateralManagement}</li>
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
 * "CollateralManagement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of operations relative to the management of collateral, variation margins, default fund participation and independent amount."
 * </li>
 * </ul>
 */
public class CollateralManagement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies collateral proposed to the counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal#RelatedManagementProcess
	 * CollateralProposal.RelatedManagementProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralProposal
	 * CollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralProposal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies collateral proposed to the counterparty."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralProposal = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralManagement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralProposal";
			definition = "Specifies collateral proposed to the counterparty.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CollateralProposal.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralProposal.RelatedManagementProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides details about the valuation of each piece of collateral that is
	 * posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#RelatedManagementProcess
	 * CollateralValuation.RelatedManagementProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralValuation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the valuation of each piece of collateral that is posted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralValuation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralManagement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValuation";
			definition = "Provides details about the valuation of each piece of collateral that is posted.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralValuation.RelatedManagementProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the amount of money paid for the provision of financial
	 * services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#CollateralManagement
	 * Adjustment.CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FeesAndCommissions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount of money paid for the provision of financial services."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FeesAndCommissions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralManagement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeesAndCommissions";
			definition = "Specifies the amount of money paid for the provision of financial services.";
			minOccurs = 0;
			type_lazy = () -> Adjustment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.CollateralManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Calculation and request of interest linked to collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#CollateralManagement
	 * CollateralInterestAdministration.CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration
	 * CollateralInterestAdministration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculation and request of interest linked to collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InterestManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralManagement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestManagement";
			definition = "Calculation and request of interest linked to collateral.";
			minOccurs = 0;
			type_lazy = () -> CollateralInterestAdministration.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralInterestAdministration.CollateralManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides the dispute details on the variation margin and/or the
	 * segregated independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DisputeManagement#RelatedManagementProcess
	 * DisputeManagement.RelatedManagementProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DisputeManagement
	 * DisputeManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputeManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the dispute details on the variation margin and/or the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DisputeManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralManagement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputeManagement";
			definition = "Provides the dispute details on the variation margin and/or the segregated independent amount.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.DisputeManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DisputeManagement.RelatedManagementProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Calculation of the variation margin and independent amount needed to
	 * cover the risk exposure of one party versus another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#RelatedManagementProcess
	 * MarginCall.RelatedManagementProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MarginCall
	 * MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation of the  variation margin and independent amount needed to cover the risk exposure of one party versus another."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MarginCall = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralManagement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCall";
			definition = "Calculation of the  variation margin and independent amount needed to cover the risk exposure of one party versus another.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.RelatedManagementProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Request of a substitution of collateral by specifying the collateral to
	 * be returned and proposing the new type(s) of collateral to be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#RelatedManagementProcess
	 * CollateralSubstitution.RelatedManagementProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution
	 * CollateralSubstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request of a substitution of collateral by specifying the collateral to be returned and proposing the new type(s) of collateral to be delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralSubstitution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralManagement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitution";
			definition = "Request of a substitution of collateral by specifying the collateral to be returned and proposing the new type(s) of collateral to be delivered.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CollateralSubstitution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralSubstitution.RelatedManagementProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Risk which is the source of the collateral management processes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#CollateralManagement
	 * ExposureCalculation.CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ExposureCalculation
	 * ExposureCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskToCover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Risk which is the source of the collateral management processes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RiskToCover = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralManagement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskToCover";
			definition = "Risk which is the source of the collateral management processes.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ExposureCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.CollateralManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Description of the collateral which is related to the different
	 * management processes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralManagement
	 * Collateral.CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of the collateral which is related to the different management processes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Collateral = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralManagement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Collateral";
			definition = "Description of the collateral which is related to the different management processes.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.CollateralManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the terms bilaterally agreed by the parties related to the
	 * collateral processes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#RiskCoverage
	 * CollateralAgreement.RiskCoverage}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreedTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the terms bilaterally agreed by the parties related to the collateral processes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AgreedTerms = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralManagement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedTerms";
			definition = "Specifies the terms bilaterally agreed by the parties related to the collateral processes.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CollateralAgreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.RiskCoverage;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Clearing system involved in the collateral management process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingSystem#CollateralManagement
	 * ClearingSystem.CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingSystem
	 * ClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing system involved in the collateral management process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClearingSystem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralManagement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystem";
			definition = "Clearing system involved in the collateral management process.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ClearingSystem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingSystem.CollateralManagement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralManagement";
				definition = "Set of operations relative to the management of collateral, variation margins, default fund participation and independent amount.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Adjustment.CollateralManagement, com.tools20022.repository.entity.ClearingSystem.CollateralManagement,
						com.tools20022.repository.entity.Collateral.CollateralManagement, com.tools20022.repository.entity.CollateralValuation.RelatedManagementProcess, com.tools20022.repository.entity.CollateralAgreement.RiskCoverage,
						com.tools20022.repository.entity.MarginCall.RelatedManagementProcess, com.tools20022.repository.entity.CollateralProposal.RelatedManagementProcess,
						com.tools20022.repository.entity.CollateralSubstitution.RelatedManagementProcess, com.tools20022.repository.entity.ExposureCalculation.CollateralManagement,
						com.tools20022.repository.entity.DisputeManagement.RelatedManagementProcess, com.tools20022.repository.entity.CollateralInterestAdministration.CollateralManagement);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralManagement.CollateralProposal, com.tools20022.repository.entity.CollateralManagement.CollateralValuation,
						com.tools20022.repository.entity.CollateralManagement.FeesAndCommissions, com.tools20022.repository.entity.CollateralManagement.InterestManagement,
						com.tools20022.repository.entity.CollateralManagement.DisputeManagement, com.tools20022.repository.entity.CollateralManagement.MarginCall,
						com.tools20022.repository.entity.CollateralManagement.CollateralSubstitution, com.tools20022.repository.entity.CollateralManagement.RiskToCover, com.tools20022.repository.entity.CollateralManagement.Collateral,
						com.tools20022.repository.entity.CollateralManagement.AgreedTerms, com.tools20022.repository.entity.CollateralManagement.ClearingSystem);
			}
		});
		return mmObject_lazy.get();
	}
}