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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.OperatorCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Code containing the operator used to indicate the relationship between a
 * variable and a fixed value.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OperatorCode#SmallerThan
 * OperatorCode.mmSmallerThan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OperatorCode#SmallerOrEqualTo
 * OperatorCode.mmSmallerOrEqualTo}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OperatorCode#GreaterThan
 * OperatorCode.mmGreaterThan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OperatorCode#GreaterOrEqualTo
 * OperatorCode.mmGreaterOrEqualTo}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OperatorCode#EqualTo
 * OperatorCode.mmEqualTo}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SMAL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OperatorCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Code containing the operator used to indicate the relationship between a variable and a fixed value."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OperatorCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Smaller than.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OperatorCode OperatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SmallerThan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Smaller than."</li>
	 * </ul>
	 */
	public static final OperatorCode SmallerThan = new OperatorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SmallerThan";
			definition = "Smaller than.";
			owner_lazy = () -> com.tools20022.repository.codeset.OperatorCode.mmObject();
			codeName = "SMAL";
		}
	};
	/**
	 * Smaller or equal to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OperatorCode OperatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMEQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SmallerOrEqualTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Smaller or equal to."</li>
	 * </ul>
	 */
	public static final OperatorCode SmallerOrEqualTo = new OperatorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SmallerOrEqualTo";
			definition = "Smaller or equal to.";
			owner_lazy = () -> com.tools20022.repository.codeset.OperatorCode.mmObject();
			codeName = "SMEQ";
		}
	};
	/**
	 * Greater than.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OperatorCode OperatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GreaterThan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Greater than."</li>
	 * </ul>
	 */
	public static final OperatorCode GreaterThan = new OperatorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GreaterThan";
			definition = "Greater than.";
			owner_lazy = () -> com.tools20022.repository.codeset.OperatorCode.mmObject();
			codeName = "GREA";
		}
	};
	/**
	 * Greater or equal to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OperatorCode OperatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GREQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GreaterOrEqualTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Greater or equal to."</li>
	 * </ul>
	 */
	public static final OperatorCode GreaterOrEqualTo = new OperatorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GreaterOrEqualTo";
			definition = "Greater or equal to.";
			owner_lazy = () -> com.tools20022.repository.codeset.OperatorCode.mmObject();
			codeName = "GREQ";
		}
	};
	/**
	 * Equal to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OperatorCode OperatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Equal to."</li>
	 * </ul>
	 */
	public static final OperatorCode EqualTo = new OperatorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualTo";
			definition = "Equal to.";
			owner_lazy = () -> com.tools20022.repository.codeset.OperatorCode.mmObject();
			codeName = "EQAL";
		}
	};
	final static private LinkedHashMap<String, OperatorCode> codesByName = new LinkedHashMap<>();

	protected OperatorCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("SMAL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OperatorCode";
				definition = "Code containing the operator used to indicate the relationship between a variable and a fixed value.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OperatorCode.SmallerThan, com.tools20022.repository.codeset.OperatorCode.SmallerOrEqualTo, com.tools20022.repository.codeset.OperatorCode.GreaterThan,
						com.tools20022.repository.codeset.OperatorCode.GreaterOrEqualTo, com.tools20022.repository.codeset.OperatorCode.EqualTo);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SmallerThan.getCodeName().get(), SmallerThan);
		codesByName.put(SmallerOrEqualTo.getCodeName().get(), SmallerOrEqualTo);
		codesByName.put(GreaterThan.getCodeName().get(), GreaterThan);
		codesByName.put(GreaterOrEqualTo.getCodeName().get(), GreaterOrEqualTo);
		codesByName.put(EqualTo.getCodeName().get(), EqualTo);
	}

	public static OperatorCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OperatorCode[] values() {
		OperatorCode[] values = new OperatorCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OperatorCode> {
		@Override
		public OperatorCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OperatorCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}