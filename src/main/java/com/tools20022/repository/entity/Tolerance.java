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
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Variance allowed on a quantity or on a price.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Tolerance" src="doc-files/Tolerance.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tolerance#mmRelatedUndertakingAmount
 * Tolerance.mmRelatedUndertakingAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tolerance#mmQuantity
 * Tolerance.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tolerance#mmPlusPercent
 * Tolerance.mmPlusPercent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tolerance#mmMinusPercent
 * Tolerance.mmMinusPercent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tolerance#mmPrice
 * Tolerance.mmPrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmPriceTolerance
 * Price.mmPriceTolerance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmQuantityTolerance
 * ProductQuantity.mmQuantityTolerance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#mmTolerance
 * UndertakingAmount.mmTolerance}</li>
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
 * "Tolerance"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Variance allowed on a quantity or on a price."</li>
 * </ul>
 */
public class Tolerance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected UndertakingAmount relatedUndertakingAmount;
	/**
	 * Undertaking amount for which a tolerance is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#mmTolerance
	 * UndertakingAmount.mmTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UndertakingAmount
	 * UndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tolerance
	 * Tolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedUndertakingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking amount for which a tolerance is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedUndertakingAmount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tolerance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedUndertakingAmount";
			definition = "Undertaking amount for which a tolerance is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.mmTolerance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingAmount.mmObject();
		}
	};
	protected ProductQuantity quantity;
	/**
	 * Quantity of product on which a tolerance is allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmQuantityTolerance
	 * ProductQuantity.mmQuantityTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tolerance
	 * Tolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of product on which a tolerance is allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tolerance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Quantity of product on which a tolerance is allowed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmQuantityTolerance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmObject();
		}
	};
	protected PercentageRate plusPercent;
	/**
	 * Variance in percentage allowed over the agreed dimension. For example,
	 * plus 10 percent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tolerance
	 * Tolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlusPercent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Variance in percentage allowed over the agreed dimension. For example, plus 10 percent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPlusPercent = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tolerance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlusPercent";
			definition = "Variance in percentage allowed over the agreed dimension. For example, plus 10 percent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tolerance.class.getMethod("getPlusPercent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate minusPercent;
	/**
	 * Variance in percentage allowed below the agreed dimension. For example,
	 * minus 10 percent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tolerance
	 * Tolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinusPercent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Variance in percentage allowed below the agreed dimension. For example, minus 10 percent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinusPercent = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tolerance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinusPercent";
			definition = "Variance in percentage allowed below the agreed dimension. For example, minus 10 percent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Tolerance.class.getMethod("getMinusPercent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Price price;
	/**
	 * Price on which a tolerance is allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmPriceTolerance
	 * Price.mmPriceTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tolerance
	 * Tolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price on which a tolerance is allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Tolerance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Price on which a tolerance is allowed.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.mmPriceTolerance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Tolerance";
				definition = "Variance allowed on a quantity or on a price.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Price.mmPriceTolerance, com.tools20022.repository.entity.ProductQuantity.mmQuantityTolerance,
						com.tools20022.repository.entity.UndertakingAmount.mmTolerance);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Tolerance.mmRelatedUndertakingAmount, com.tools20022.repository.entity.Tolerance.mmQuantity, com.tools20022.repository.entity.Tolerance.mmPlusPercent,
						com.tools20022.repository.entity.Tolerance.mmMinusPercent, com.tools20022.repository.entity.Tolerance.mmPrice);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Tolerance.class;
			}
		});
		return mmObject_lazy.get();
	}

	public UndertakingAmount getRelatedUndertakingAmount() {
		return relatedUndertakingAmount;
	}

	public void setRelatedUndertakingAmount(com.tools20022.repository.entity.UndertakingAmount relatedUndertakingAmount) {
		this.relatedUndertakingAmount = relatedUndertakingAmount;
	}

	public ProductQuantity getQuantity() {
		return quantity;
	}

	public void setQuantity(com.tools20022.repository.entity.ProductQuantity quantity) {
		this.quantity = quantity;
	}

	public PercentageRate getPlusPercent() {
		return plusPercent;
	}

	public void setPlusPercent(PercentageRate plusPercent) {
		this.plusPercent = plusPercent;
	}

	public PercentageRate getMinusPercent() {
		return minusPercent;
	}

	public void setMinusPercent(PercentageRate minusPercent) {
		this.minusPercent = minusPercent;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(com.tools20022.repository.entity.Price price) {
		this.price = price;
	}
}