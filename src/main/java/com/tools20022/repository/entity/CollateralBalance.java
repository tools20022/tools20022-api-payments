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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the different values taken into account to calculate the current
 * collateral.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CollateralBalance" src="doc-files/CollateralBalance.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmCollateralDescription
 * CollateralBalance.mmCollateralDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmHeldAmount
 * CollateralBalance.mmHeldAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmPriorAgreed
 * CollateralBalance.mmPriorAgreed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmVariationMarginRelatedRiskCalculation
 * CollateralBalance.mmVariationMarginRelatedRiskCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmInTransit
 * CollateralBalance.mmInTransit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmSegregatedIndependentAmountRelatedRiskCalculation
 * CollateralBalance.mmSegregatedIndependentAmountRelatedRiskCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmRelatedCollateralInterestManagement
 * CollateralBalance.mmRelatedCollateralInterestManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmCollateralInterestManagement
 * CollateralBalance.mmCollateralInterestManagement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralBalance
 * Collateral.mmCollateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCurrentVariationMargin
 * ExposureCalculation.mmCurrentVariationMargin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCurrentSegregatedIndependentAmount
 * ExposureCalculation.mmCurrentSegregatedIndependentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#mmClosingCollateralBalance
 * CollateralInterestAdministration.mmClosingCollateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#mmOpeningCollateralBalance
 * CollateralInterestAdministration.mmOpeningCollateralBalance}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralBalance"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different values taken into account to calculate the current collateral."
 * </li>
 * </ul>
 */
public class CollateralBalance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Collateral> collateralDescription;
	/**
	 * Describes the collateral included in the collateral balance,
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralBalance
	 * Collateral.mmCollateralBalance}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the collateral included in the collateral balance,"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCollateralDescription = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralDescription";
			definition = "Describes the collateral included in the collateral balance,";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Collateral.mmCollateralBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount heldAmount;
	/**
	 * Specifies the collateral currently held.
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HeldAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the collateral currently held."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmHeldAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HeldAmount";
			definition = "Specifies the collateral currently held.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralBalance.class.getMethod("getHeldAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount priorAgreed;
	/**
	 * Specifies the collateral which has been agreed but is not yet
	 * transferred.
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorAgreed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral which has been agreed but is not yet transferred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPriorAgreed = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorAgreed";
			definition = "Specifies the collateral which has been agreed but is not yet transferred.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralBalance.class.getMethod("getPriorAgreed", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExposureCalculation variationMarginRelatedRiskCalculation;
	/**
	 * Risk coverage for which a current variation margin is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCurrentVariationMargin
	 * ExposureCalculation.mmCurrentVariationMargin}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginRelatedRiskCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Risk coverage for which a current variation margin is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmVariationMarginRelatedRiskCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMarginRelatedRiskCalculation";
			definition = "Risk coverage for which a current variation margin is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmCurrentVariationMargin;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount inTransit;
	/**
	 * Specifies the collateral which is being transferred.
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InTransit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the collateral which is being transferred."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInTransit = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InTransit";
			definition = "Specifies the collateral which is being transferred.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralBalance.class.getMethod("getInTransit", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExposureCalculation segregatedIndependentAmountRelatedRiskCalculation;
	/**
	 * Risk coverage for which a collateral balance is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCurrentSegregatedIndependentAmount
	 * ExposureCalculation.mmCurrentSegregatedIndependentAmount}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmountRelatedRiskCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Risk coverage for which a collateral balance is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSegregatedIndependentAmountRelatedRiskCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmountRelatedRiskCalculation";
			definition = "Risk coverage for which a collateral balance is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmCurrentSegregatedIndependentAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.mmObject();
		}
	};
	protected CollateralInterestAdministration relatedCollateralInterestManagement;
	/**
	 * Collateral interest management for which an opening balance is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#mmOpeningCollateralBalance
	 * CollateralInterestAdministration.mmOpeningCollateralBalance}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralInterestManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral interest management for which an opening balance is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCollateralInterestManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralInterestManagement";
			definition = "Collateral interest management for which an opening balance is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralInterestAdministration.mmOpeningCollateralBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralInterestAdministration.mmObject();
		}
	};
	protected CollateralInterestAdministration collateralInterestManagement;
	/**
	 * Collateral interest management for which a closing balance is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralInterestAdministration#mmClosingCollateralBalance
	 * CollateralInterestAdministration.mmClosingCollateralBalance}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralInterestManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral interest management for which a closing balance is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCollateralInterestManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralInterestManagement";
			definition = "Collateral interest management for which a closing balance is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralInterestAdministration.mmClosingCollateralBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralInterestAdministration.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralBalance";
				definition = "Specifies the different values taken into account to calculate the current collateral.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Collateral.mmCollateralBalance, com.tools20022.repository.entity.ExposureCalculation.mmCurrentVariationMargin,
						com.tools20022.repository.entity.ExposureCalculation.mmCurrentSegregatedIndependentAmount, com.tools20022.repository.entity.CollateralInterestAdministration.mmClosingCollateralBalance,
						com.tools20022.repository.entity.CollateralInterestAdministration.mmOpeningCollateralBalance);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralBalance.mmCollateralDescription, com.tools20022.repository.entity.CollateralBalance.mmHeldAmount,
						com.tools20022.repository.entity.CollateralBalance.mmPriorAgreed, com.tools20022.repository.entity.CollateralBalance.mmVariationMarginRelatedRiskCalculation,
						com.tools20022.repository.entity.CollateralBalance.mmInTransit, com.tools20022.repository.entity.CollateralBalance.mmSegregatedIndependentAmountRelatedRiskCalculation,
						com.tools20022.repository.entity.CollateralBalance.mmRelatedCollateralInterestManagement, com.tools20022.repository.entity.CollateralBalance.mmCollateralInterestManagement);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CollateralBalance.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Collateral> getCollateralDescription() {
		return collateralDescription;
	}

	public void setCollateralDescription(List<com.tools20022.repository.entity.Collateral> collateralDescription) {
		this.collateralDescription = collateralDescription;
	}

	public ActiveCurrencyAndAmount getHeldAmount() {
		return heldAmount;
	}

	public void setHeldAmount(ActiveCurrencyAndAmount heldAmount) {
		this.heldAmount = heldAmount;
	}

	public ActiveCurrencyAndAmount getPriorAgreed() {
		return priorAgreed;
	}

	public void setPriorAgreed(ActiveCurrencyAndAmount priorAgreed) {
		this.priorAgreed = priorAgreed;
	}

	public ExposureCalculation getVariationMarginRelatedRiskCalculation() {
		return variationMarginRelatedRiskCalculation;
	}

	public void setVariationMarginRelatedRiskCalculation(com.tools20022.repository.entity.ExposureCalculation variationMarginRelatedRiskCalculation) {
		this.variationMarginRelatedRiskCalculation = variationMarginRelatedRiskCalculation;
	}

	public ActiveCurrencyAndAmount getInTransit() {
		return inTransit;
	}

	public void setInTransit(ActiveCurrencyAndAmount inTransit) {
		this.inTransit = inTransit;
	}

	public ExposureCalculation getSegregatedIndependentAmountRelatedRiskCalculation() {
		return segregatedIndependentAmountRelatedRiskCalculation;
	}

	public void setSegregatedIndependentAmountRelatedRiskCalculation(com.tools20022.repository.entity.ExposureCalculation segregatedIndependentAmountRelatedRiskCalculation) {
		this.segregatedIndependentAmountRelatedRiskCalculation = segregatedIndependentAmountRelatedRiskCalculation;
	}

	public CollateralInterestAdministration getRelatedCollateralInterestManagement() {
		return relatedCollateralInterestManagement;
	}

	public void setRelatedCollateralInterestManagement(com.tools20022.repository.entity.CollateralInterestAdministration relatedCollateralInterestManagement) {
		this.relatedCollateralInterestManagement = relatedCollateralInterestManagement;
	}

	public CollateralInterestAdministration getCollateralInterestManagement() {
		return collateralInterestManagement;
	}

	public void setCollateralInterestManagement(com.tools20022.repository.entity.CollateralInterestAdministration collateralInterestManagement) {
		this.collateralInterestManagement = collateralInterestManagement;
	}
}