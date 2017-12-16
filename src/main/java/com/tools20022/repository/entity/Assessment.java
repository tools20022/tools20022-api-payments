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
import com.tools20022.repository.codeset.POIComponentAssessmentCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Assessment for the components of a system.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Assessment" src="doc-files/Assessment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Assessment#mmAssessmentType
 * Assessment.mmAssessmentType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Assessment#mmSystem
 * Assessment.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Assessment#mmExpiryDate
 * Assessment.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Assessment#mmDeliveryDate
 * Assessment.mmDeliveryDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmAssessment
 * System.mmAssessment}</li>
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
 * "Assessment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Assessment for the components of a system."</li>
 * </ul>
 */
public class Assessment extends Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected POIComponentAssessmentCode assessmentType;
	/**
	 * Type of assessment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentAssessmentCode
	 * POIComponentAssessmentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Assessment Assessment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssessmentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of assessment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAssessmentType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Assessment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssessmentType";
			definition = "Type of assessment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> POIComponentAssessmentCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Assessment.class.getMethod("getAssessmentType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.System> system;
	/**
	 * System for which an assessment is produced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#mmAssessment
	 * System.mmAssessment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Assessment Assessment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System for which an assessment is produced."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Assessment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which an assessment is produced.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.System.mmAssessment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};
	protected ISODateTime expiryDate;
	/**
	 * Date when the assessment expires.
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
	 * {@linkplain com.tools20022.repository.entity.Assessment Assessment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the assessment expires."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExpiryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Assessment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date when the assessment expires.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Assessment.class.getMethod("getExpiryDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime deliveryDate;
	/**
	 * Date when the assessment document was delivered.
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
	 * {@linkplain com.tools20022.repository.entity.Assessment Assessment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the assessment document was delivered."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDeliveryDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Assessment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryDate";
			definition = "Date when the assessment document was delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Assessment.class.getMethod("getDeliveryDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Assessment";
				definition = "Assessment for the components of a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.System.mmAssessment);
				superType_lazy = () -> Document.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Assessment.mmAssessmentType, com.tools20022.repository.entity.Assessment.mmSystem, com.tools20022.repository.entity.Assessment.mmExpiryDate,
						com.tools20022.repository.entity.Assessment.mmDeliveryDate);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Assessment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public POIComponentAssessmentCode getAssessmentType() {
		return assessmentType;
	}

	public void setAssessmentType(POIComponentAssessmentCode assessmentType) {
		this.assessmentType = assessmentType;
	}

	public List<System> getSystem() {
		return system;
	}

	public void setSystem(List<com.tools20022.repository.entity.System> system) {
		this.system = system;
	}

	public ISODateTime getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(ISODateTime expiryDate) {
		this.expiryDate = expiryDate;
	}

	public ISODateTime getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(ISODateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
}