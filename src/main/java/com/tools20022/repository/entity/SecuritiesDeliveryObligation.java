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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Obligation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Obligation for one party to deliver securities to another party.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesDeliveryObligation"
 * src="doc-files/SecuritiesDeliveryObligation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#CCPEligibility
 * SecuritiesDeliveryObligation.CCPEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#NettingEligibility
 * SecuritiesDeliveryObligation.NettingEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#TransferInstructionDate
 * SecuritiesDeliveryObligation.TransferInstructionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#TransferCurrency
 * SecuritiesDeliveryObligation.TransferCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#RelatedCorporateAction
 * SecuritiesDeliveryObligation.RelatedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#RelatedCollateralMovement
 * SecuritiesDeliveryObligation.RelatedCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SecuritiesTradeExecution
 * SecuritiesDeliveryObligation.SecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#RelatedPortfolioTransfer
 * SecuritiesDeliveryObligation.RelatedPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SecuritiesTransfer
 * SecuritiesDeliveryObligation.SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SettlementInstructionGeneration
 * SecuritiesDeliveryObligation.SettlementInstructionGeneration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SettlementDateCode
 * SecuritiesDeliveryObligation.SettlementDateCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SecuritiesLending
 * SecuritiesDeliveryObligation.SecuritiesLending}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#SecuritiesDeliveryObligation
 * SecuritiesTransfer.SecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#SecuritiesDeliveryObligation
 * PortfolioTransfer.SecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#SecuritiesDeliveryObligation
 * SecuritiesTradeExecution.SecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#SecuritiesProceedsMovement
 * CorporateActionProceedsDeliveryInstruction.SecuritiesProceedsMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#SecuritiesDeliveryObligation
 * SecuritiesLending.SecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#SecuritiesCollateralMovement
 * CollateralMovement.SecuritiesCollateralMovement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Obligation
 * Obligation}</li>
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
 * "SecuritiesDeliveryObligation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Obligation for one party to deliver securities to another party."</li>
 * </ul>
 */
public class SecuritiesDeliveryObligation extends Obligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies whether the settlement transaction is CCP (Central
	 * Counterparty) eligible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CCPEligibility = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CCPEligibility";
			definition = "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether the settlement transaction is eligible for netting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettingEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is eligible for netting."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NettingEligibility = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NettingEligibility";
			definition = "Specifies whether the settlement transaction is eligible for netting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date at which the instructing party places the transfer instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferInstructionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the instructing party places the transfer instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransferInstructionDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferInstructionDate";
			definition = "Date at which the instructing party places the transfer instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Identifies the currency to be used to transfer the holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the currency to be used to transfer the holdings."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransferCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferCurrency";
			definition = "Identifies the currency to be used to transfer the holdings.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Corporate action processes which are the source of the securities
	 * delivery obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#SecuritiesProceedsMovement
	 * CorporateActionProceedsDeliveryInstruction.SecuritiesProceedsMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action processes which are the source of the securities delivery obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateAction";
			definition = "Corporate action processes which are the source of the securities delivery obligation.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SecuritiesProceedsMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Collateral movement which is the source of the obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#SecuritiesCollateralMovement
	 * CollateralMovement.SecuritiesCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral movement which is the source of the obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCollateralMovement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralMovement";
			definition = "Collateral movement which is the source of the obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CollateralMovement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.SecuritiesCollateralMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the trade which originates the delivery obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#SecuritiesDeliveryObligation
	 * SecuritiesTradeExecution.SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade which originates the delivery obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Specifies the trade which originates the delivery obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.SecuritiesDeliveryObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Portfolio transfer which is the source of the securities delivery
	 * obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#SecuritiesDeliveryObligation
	 * PortfolioTransfer.SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPortfolioTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portfolio transfer which is the source of the securities delivery obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPortfolioTransfer";
			definition = "Portfolio transfer which is the source of the securities delivery obligation.";
			minOccurs = 0;
			type_lazy = () -> PortfolioTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.SecuritiesDeliveryObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Completion of a securities settlement instruction, wherein securities are
	 * delivered/debited from a securities account and received/credited to the
	 * designated securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#SecuritiesDeliveryObligation
	 * SecuritiesTransfer.SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.SecuritiesDeliveryObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether the ETC provider should generate settlement
	 * instructions or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstructionGeneration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the ETC provider should generate settlement instructions or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementInstructionGeneration = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementInstructionGeneration";
			definition = "Specifies whether the ETC provider should generate settlement instructions or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Requested date of trade settlement, in coded form, for example, trade
	 * date +1).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDateCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested date of trade settlement, in coded form, for example, trade date +1)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementDateCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementDateCode";
			definition = "Requested date of trade settlement, in coded form, for example, trade date +1).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
		}
	};
	/**
	 * Securities lending process which covers the delivery of securities by the
	 * seller.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#SecuritiesDeliveryObligation
	 * SecuritiesLending.SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities lending process which covers the delivery of securities by the seller."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesLending = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesLending";
			definition = "Securities lending process which covers the delivery of securities by the seller.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.SecuritiesDeliveryObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesDeliveryObligation";
				definition = "Obligation for one party to deliver securities to another party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTransfer.SecuritiesDeliveryObligation, com.tools20022.repository.entity.PortfolioTransfer.SecuritiesDeliveryObligation,
						com.tools20022.repository.entity.SecuritiesTradeExecution.SecuritiesDeliveryObligation, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SecuritiesProceedsMovement,
						com.tools20022.repository.entity.SecuritiesLending.SecuritiesDeliveryObligation, com.tools20022.repository.entity.CollateralMovement.SecuritiesCollateralMovement);
				superType_lazy = () -> Obligation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesDeliveryObligation.CCPEligibility, com.tools20022.repository.entity.SecuritiesDeliveryObligation.NettingEligibility,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.TransferInstructionDate, com.tools20022.repository.entity.SecuritiesDeliveryObligation.TransferCurrency,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedCorporateAction, com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedCollateralMovement,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedPortfolioTransfer,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesTransfer, com.tools20022.repository.entity.SecuritiesDeliveryObligation.SettlementInstructionGeneration,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.SettlementDateCode, com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesLending);
			}
		});
		return mmObject_lazy.get();
	}
}