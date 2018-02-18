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
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateralProposal
 * CollateralManagement.mmCollateralProposal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateralValuation
 * CollateralManagement.mmCollateralValuation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmFeesAndCommissions
 * CollateralManagement.mmFeesAndCommissions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmInterestManagement
 * CollateralManagement.mmInterestManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmDisputeManagement
 * CollateralManagement.mmDisputeManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmMarginCall
 * CollateralManagement.mmMarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateralSubstitution
 * CollateralManagement.mmCollateralSubstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmRiskToCover
 * CollateralManagement.mmRiskToCover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateral
 * CollateralManagement.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmAgreedTerms
 * CollateralManagement.mmAgreedTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmClearingSystem
 * CollateralManagement.mmClearingSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCollateralManagement
 * Adjustment.mmCollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingSystem#mmCollateralManagement
 * ClearingSystem.mmCollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralManagement
 * Collateral.mmCollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmRelatedManagementProcess
 * CollateralValuation.mmRelatedManagementProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmRiskCoverage
 * CollateralAgreement.mmRiskCoverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MarginCall#mmRelatedManagementProcess
 * MarginCall.mmRelatedManagementProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralProposal#mmRelatedManagementProcess
 * CollateralProposal.mmRelatedManagementProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#mmRelatedManagementProcess
 * CollateralSubstitution.mmRelatedManagementProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCollateralManagement
 * ExposureCalculation.mmCollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisputeManagement#mmRelatedManagementProcess
 * DisputeManagement.mmRelatedManagementProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#mmCollateralManagement
 * CollateralInterestAdministration.mmCollateralManagement}</li>
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
	protected List<com.tools20022.repository.entity.CollateralProposal> collateralProposal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal#mmRelatedManagementProcess
	 * CollateralProposal.mmRelatedManagementProcess}</li>
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
	public static final MMBusinessAssociationEnd mmCollateralProposal = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralProposal";
			definition = "Specifies collateral proposed to the counterparty.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralProposal.mmRelatedManagementProcess;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralProposal.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CollateralValuation> collateralValuation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmRelatedManagementProcess
	 * CollateralValuation.mmRelatedManagementProcess}</li>
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
	public static final MMBusinessAssociationEnd mmCollateralValuation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValuation";
			definition = "Provides details about the valuation of each piece of collateral that is posted.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmRelatedManagementProcess;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Adjustment> feesAndCommissions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCollateralManagement
	 * Adjustment.mmCollateralManagement}</li>
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
	public static final MMBusinessAssociationEnd mmFeesAndCommissions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeesAndCommissions";
			definition = "Specifies the amount of money paid for the provision of financial services.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.mmCollateralManagement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CollateralInterestAdministration> interestManagement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#mmCollateralManagement
	 * CollateralInterestAdministration.mmCollateralManagement}</li>
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
	public static final MMBusinessAssociationEnd mmInterestManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestManagement";
			definition = "Calculation and request of interest linked to collateral.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralInterestAdministration.mmCollateralManagement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralInterestAdministration.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DisputeManagement> disputeManagement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DisputeManagement#mmRelatedManagementProcess
	 * DisputeManagement.mmRelatedManagementProcess}</li>
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
	public static final MMBusinessAssociationEnd mmDisputeManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputeManagement";
			definition = "Provides the dispute details on the variation margin and/or the segregated independent amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DisputeManagement.mmRelatedManagementProcess;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DisputeManagement.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.MarginCall> marginCall;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmRelatedManagementProcess
	 * MarginCall.mmRelatedManagementProcess}</li>
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
	public static final MMBusinessAssociationEnd mmMarginCall = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCall";
			definition = "Calculation of the  variation margin and independent amount needed to cover the risk exposure of one party versus another.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.MarginCall.mmRelatedManagementProcess;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.MarginCall.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CollateralSubstitution> collateralSubstitution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#mmRelatedManagementProcess
	 * CollateralSubstitution.mmRelatedManagementProcess}</li>
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
	public static final MMBusinessAssociationEnd mmCollateralSubstitution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitution";
			definition = "Request of a substitution of collateral by specifying the collateral to be returned and proposing the new type(s) of collateral to be delivered.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralSubstitution.mmRelatedManagementProcess;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralSubstitution.mmObject();
		}
	};
	protected ExposureCalculation riskToCover;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCollateralManagement
	 * ExposureCalculation.mmCollateralManagement}</li>
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
	public static final MMBusinessAssociationEnd mmRiskToCover = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskToCover";
			definition = "Risk which is the source of the collateral management processes.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmCollateralManagement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Collateral> collateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralManagement
	 * Collateral.mmCollateralManagement}</li>
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
	public static final MMBusinessAssociationEnd mmCollateral = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Collateral";
			definition = "Description of the collateral which is related to the different management processes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.mmCollateralManagement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};
	protected CollateralAgreement agreedTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmRiskCoverage
	 * CollateralAgreement.mmRiskCoverage}</li>
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
	public static final MMBusinessAssociationEnd mmAgreedTerms = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedTerms";
			definition = "Specifies the terms bilaterally agreed by the parties related to the collateral processes.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmRiskCoverage;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmObject();
		}
	};
	protected ClearingSystem clearingSystem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingSystem#mmCollateralManagement
	 * ClearingSystem.mmCollateralManagement}</li>
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
	public static final MMBusinessAssociationEnd mmClearingSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystem";
			definition = "Clearing system involved in the collateral management process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingSystem.mmCollateralManagement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingSystem.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralManagement";
				definition = "Set of operations relative to the management of collateral, variation margins, default fund participation and independent amount.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Adjustment.mmCollateralManagement, com.tools20022.repository.entity.ClearingSystem.mmCollateralManagement,
						com.tools20022.repository.entity.Collateral.mmCollateralManagement, com.tools20022.repository.entity.CollateralValuation.mmRelatedManagementProcess,
						com.tools20022.repository.entity.CollateralAgreement.mmRiskCoverage, com.tools20022.repository.entity.MarginCall.mmRelatedManagementProcess,
						com.tools20022.repository.entity.CollateralProposal.mmRelatedManagementProcess, com.tools20022.repository.entity.CollateralSubstitution.mmRelatedManagementProcess,
						com.tools20022.repository.entity.ExposureCalculation.mmCollateralManagement, com.tools20022.repository.entity.DisputeManagement.mmRelatedManagementProcess,
						com.tools20022.repository.entity.CollateralInterestAdministration.mmCollateralManagement);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralManagement.mmCollateralProposal, com.tools20022.repository.entity.CollateralManagement.mmCollateralValuation,
						com.tools20022.repository.entity.CollateralManagement.mmFeesAndCommissions, com.tools20022.repository.entity.CollateralManagement.mmInterestManagement,
						com.tools20022.repository.entity.CollateralManagement.mmDisputeManagement, com.tools20022.repository.entity.CollateralManagement.mmMarginCall,
						com.tools20022.repository.entity.CollateralManagement.mmCollateralSubstitution, com.tools20022.repository.entity.CollateralManagement.mmRiskToCover,
						com.tools20022.repository.entity.CollateralManagement.mmCollateral, com.tools20022.repository.entity.CollateralManagement.mmAgreedTerms, com.tools20022.repository.entity.CollateralManagement.mmClearingSystem);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CollateralManagement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CollateralProposal> getCollateralProposal() {
		return collateralProposal == null ? collateralProposal = new ArrayList<>() : collateralProposal;
	}

	public CollateralManagement setCollateralProposal(List<com.tools20022.repository.entity.CollateralProposal> collateralProposal) {
		this.collateralProposal = Objects.requireNonNull(collateralProposal);
		return this;
	}

	public List<CollateralValuation> getCollateralValuation() {
		return collateralValuation == null ? collateralValuation = new ArrayList<>() : collateralValuation;
	}

	public CollateralManagement setCollateralValuation(List<com.tools20022.repository.entity.CollateralValuation> collateralValuation) {
		this.collateralValuation = Objects.requireNonNull(collateralValuation);
		return this;
	}

	public List<Adjustment> getFeesAndCommissions() {
		return feesAndCommissions == null ? feesAndCommissions = new ArrayList<>() : feesAndCommissions;
	}

	public CollateralManagement setFeesAndCommissions(List<com.tools20022.repository.entity.Adjustment> feesAndCommissions) {
		this.feesAndCommissions = Objects.requireNonNull(feesAndCommissions);
		return this;
	}

	public List<CollateralInterestAdministration> getInterestManagement() {
		return interestManagement == null ? interestManagement = new ArrayList<>() : interestManagement;
	}

	public CollateralManagement setInterestManagement(List<com.tools20022.repository.entity.CollateralInterestAdministration> interestManagement) {
		this.interestManagement = Objects.requireNonNull(interestManagement);
		return this;
	}

	public List<DisputeManagement> getDisputeManagement() {
		return disputeManagement == null ? disputeManagement = new ArrayList<>() : disputeManagement;
	}

	public CollateralManagement setDisputeManagement(List<com.tools20022.repository.entity.DisputeManagement> disputeManagement) {
		this.disputeManagement = Objects.requireNonNull(disputeManagement);
		return this;
	}

	public List<MarginCall> getMarginCall() {
		return marginCall == null ? marginCall = new ArrayList<>() : marginCall;
	}

	public CollateralManagement setMarginCall(List<com.tools20022.repository.entity.MarginCall> marginCall) {
		this.marginCall = Objects.requireNonNull(marginCall);
		return this;
	}

	public List<CollateralSubstitution> getCollateralSubstitution() {
		return collateralSubstitution == null ? collateralSubstitution = new ArrayList<>() : collateralSubstitution;
	}

	public CollateralManagement setCollateralSubstitution(List<com.tools20022.repository.entity.CollateralSubstitution> collateralSubstitution) {
		this.collateralSubstitution = Objects.requireNonNull(collateralSubstitution);
		return this;
	}

	public Optional<ExposureCalculation> getRiskToCover() {
		return riskToCover == null ? Optional.empty() : Optional.of(riskToCover);
	}

	public CollateralManagement setRiskToCover(com.tools20022.repository.entity.ExposureCalculation riskToCover) {
		this.riskToCover = riskToCover;
		return this;
	}

	public List<Collateral> getCollateral() {
		return collateral == null ? collateral = new ArrayList<>() : collateral;
	}

	public CollateralManagement setCollateral(List<com.tools20022.repository.entity.Collateral> collateral) {
		this.collateral = Objects.requireNonNull(collateral);
		return this;
	}

	public CollateralAgreement getAgreedTerms() {
		return agreedTerms;
	}

	public CollateralManagement setAgreedTerms(com.tools20022.repository.entity.CollateralAgreement agreedTerms) {
		this.agreedTerms = Objects.requireNonNull(agreedTerms);
		return this;
	}

	public ClearingSystem getClearingSystem() {
		return clearingSystem;
	}

	public CollateralManagement setClearingSystem(com.tools20022.repository.entity.ClearingSystem clearingSystem) {
		this.clearingSystem = Objects.requireNonNull(clearingSystem);
		return this;
	}
}