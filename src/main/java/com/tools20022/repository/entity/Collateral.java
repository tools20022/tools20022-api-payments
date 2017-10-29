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
import com.tools20022.repository.codeset.CollateralPurposeCode;
import com.tools20022.repository.codeset.CollateralTypeCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.ContractCollateral1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Assets pledged by a debtor to secure a loan or an exposure and subject to
 * seizure in the event of default.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Collateral" src="doc-files/Collateral.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#CollateralAmount
 * Collateral.CollateralAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#Valuation
 * Collateral.Valuation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#CollateralType
 * Collateral.CollateralType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#BaseCurrencyAmount
 * Collateral.BaseCurrencyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralPurpose
 * Collateral.CollateralPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralBalance
 * Collateral.CollateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralAccount
 * Collateral.CollateralAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralManagement
 * Collateral.CollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralPartyRole
 * Collateral.CollateralPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#Status
 * Collateral.Status}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#AssetHolding
 * Collateral.AssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#VariationMarginAssetHolding
 * Collateral.VariationMarginAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#SegregatedIndependentAmountAssetHolding
 * Collateral.SegregatedIndependentAmountAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralAgreement
 * Collateral.CollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#CollateralOwnership
 * Collateral.CollateralOwnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#RelatedCollateralSubstitution
 * Collateral.RelatedCollateralSubstitution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#RelatedCollateralProcess
 * Account.RelatedCollateralProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Collateral
 * AssetHolding.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#VariationMarginCollateral
 * AssetHolding.VariationMarginCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#IndependentAmountCollateral
 * AssetHolding.IndependentAmountCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#Collateral
 * CollateralValuation.Collateral}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CollateralStatus#Collateral
 * CollateralStatus.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#Collateral
 * CollateralAgreement.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralPartyRole#Collateral
 * CollateralPartyRole.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#Collateral
 * CollateralManagement.Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#NewCollateral
 * CollateralSubstitution.NewCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#CollateralDescription
 * CollateralBalance.CollateralDescription}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContractCollateral1#CollateralDescription
 * ContractCollateral1.CollateralDescription}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContractCollateral1
 * ContractCollateral1}</li>
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
 * "Collateral"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Assets pledged by a debtor to secure a loan or an exposure and subject to seizure in the event of default."
 * </li>
 * </ul>
 */
public class Collateral {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Value of the collateral as an amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractCollateral1#TotalAmount
	 * ContractCollateral1.TotalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the collateral as an amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CollateralAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContractCollateral1.TotalAmount);
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralAmount";
			definition = "Value of the collateral as an amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Valuation process of specific collateral elements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#Collateral
	 * CollateralValuation.Collateral}</li>
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
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Valuation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Valuation process of specific collateral elements."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Valuation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Valuation";
			definition = "Valuation process of specific collateral elements.";
			minOccurs = 0;
			type_lazy = () -> CollateralValuation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralValuation.Collateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CollateralType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralType";
			definition = "Specifies the type of collateral.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CollateralTypeCode.mmObject();
		}
	};
	/**
	 * Value of the collateral in the currency used for reporting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseCurrencyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the collateral in the currency used for reporting."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BaseCurrencyAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BaseCurrencyAmount";
			definition = "Value of the collateral in the currency used for reporting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies whether the collateral has been posted against the variation
	 * margin or the segregated independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralPurposeCode
	 * CollateralPurposeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the collateral has been posted against the variation margin or the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CollateralPurpose = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralPurpose";
			definition = "Specifies whether the collateral has been posted against the variation margin or the segregated independent amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CollateralPurposeCode.mmObject();
		}
	};
	/**
	 * Collateral balance which contain specific collateral elements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#CollateralDescription
	 * CollateralBalance.CollateralDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral balance which contain specific collateral elements."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralBalance";
			definition = "Collateral balance which contain specific collateral elements.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralBalance.CollateralDescription;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account from or to which collateral is delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#RelatedCollateralProcess
	 * Account.RelatedCollateralProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account from or to which collateral is delivered."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralAccount";
			definition = "Account from or to which collateral is delivered.";
			minOccurs = 0;
			type_lazy = () -> Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.RelatedCollateralProcess;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Series of processes which are related to the collateral processes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#Collateral
	 * CollateralManagement.Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Series of processes which are related to the collateral processes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Series of processes which are related to the collateral processes.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.Collateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the roles played by a party in the context of collateral
	 * processes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralPartyRole#Collateral
	 * CollateralPartyRole.Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralPartyRole
	 * CollateralPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the roles played by a party in the context of collateral processes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralPartyRole";
			definition = "Specifies the roles played by a party in the context of collateral processes.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CollateralPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralPartyRole.Collateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the status of the collateral or of an event related to
	 * collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus#Collateral
	 * CollateralStatus.Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the collateral or of an event related to collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the collateral or of an event related to collateral.";
			minOccurs = 0;
			type_lazy = () -> CollateralStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralStatus.Collateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the securities or physical entities given as collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#Collateral
	 * AssetHolding.Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the securities or physical entities given as collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssetHolding = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetHolding";
			definition = "Specifies the securities or physical entities given as collateral.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.Collateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies in terms of value and quantity the assets held as collateral
	 * against the variation margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#VariationMarginCollateral
	 * AssetHolding.VariationMarginCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginAssetHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies in terms of value and quantity the assets held as collateral against the variation margin."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd VariationMarginAssetHolding = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VariationMarginAssetHolding";
			definition = "Specifies in terms of value and quantity the assets held as collateral against the variation margin.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.VariationMarginCollateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies in terms of value and quantity the assets held as collateral
	 * against the segregated independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#IndependentAmountCollateral
	 * AssetHolding.IndependentAmountCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmountAssetHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies in terms of value and quantity the assets held as collateral against the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SegregatedIndependentAmountAssetHolding = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SegregatedIndependentAmountAssetHolding";
			definition = "Specifies in terms of value and quantity the assets held as collateral against the segregated independent amount.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.IndependentAmountCollateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Collateral agreement which governs the collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#Collateral
	 * CollateralAgreement.Collateral}</li>
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
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral agreement which governs the collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralAgreement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAgreement";
			definition = "Collateral agreement which governs the collateral.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.Collateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies who is the owner of the collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOwnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies who is the owner of the collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CollateralOwnership = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralOwnership";
			definition = "Specifies who is the owner of the collateral.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Collateral substitution for which new collateral is replacing the
	 * returned one.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#NewCollateral
	 * CollateralSubstitution.NewCollateral}</li>
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
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralSubstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral substitution for which new collateral is replacing the returned one."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCollateralSubstitution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Collateral.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralSubstitution";
			definition = "Collateral substitution for which new collateral is replacing the returned one.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CollateralSubstitution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralSubstitution.NewCollateral;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Collateral";
				definition = "Assets pledged by a debtor to secure a loan or an exposure and subject to seizure in the event of default.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.RelatedCollateralProcess, com.tools20022.repository.entity.AssetHolding.Collateral,
						com.tools20022.repository.entity.AssetHolding.VariationMarginCollateral, com.tools20022.repository.entity.AssetHolding.IndependentAmountCollateral, com.tools20022.repository.entity.CollateralValuation.Collateral,
						com.tools20022.repository.entity.CollateralStatus.Collateral, com.tools20022.repository.entity.CollateralAgreement.Collateral, com.tools20022.repository.entity.CollateralPartyRole.Collateral,
						com.tools20022.repository.entity.CollateralManagement.Collateral, com.tools20022.repository.entity.CollateralSubstitution.NewCollateral, com.tools20022.repository.entity.CollateralBalance.CollateralDescription);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContractCollateral1.CollateralDescription);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Collateral.CollateralAmount, com.tools20022.repository.entity.Collateral.Valuation, com.tools20022.repository.entity.Collateral.CollateralType,
						com.tools20022.repository.entity.Collateral.BaseCurrencyAmount, com.tools20022.repository.entity.Collateral.CollateralPurpose, com.tools20022.repository.entity.Collateral.CollateralBalance,
						com.tools20022.repository.entity.Collateral.CollateralAccount, com.tools20022.repository.entity.Collateral.CollateralManagement, com.tools20022.repository.entity.Collateral.CollateralPartyRole,
						com.tools20022.repository.entity.Collateral.Status, com.tools20022.repository.entity.Collateral.AssetHolding, com.tools20022.repository.entity.Collateral.VariationMarginAssetHolding,
						com.tools20022.repository.entity.Collateral.SegregatedIndependentAmountAssetHolding, com.tools20022.repository.entity.Collateral.CollateralAgreement, com.tools20022.repository.entity.Collateral.CollateralOwnership,
						com.tools20022.repository.entity.Collateral.RelatedCollateralSubstitution);
				derivationComponent_lazy = () -> Arrays.asList(ContractCollateral1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}