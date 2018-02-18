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
import com.tools20022.repository.codeset.QuantityCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Quantity is unknown by the sender or has not been established.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.QuantityCode#Open
 * QuantityCode.Open}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuantityCode#UnknownQuantity
 * QuantityCode.UnknownQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuantityCode#AllSecurities
 * QuantityCode.AllSecurities}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuantityCode#AnyAndAll
 * QuantityCode.AnyAndAll}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"OPEN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuantityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Quantity is unknown by the sender or has not been established."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QuantityCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Quantity has not been established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuantityCode QuantityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Open"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity has not been established."</li>
	 * </ul>
	 */
	public static final QuantityCode Open = new QuantityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Open";
			definition = "Quantity has not been established.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuantityCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * Quantity is unknown by the sender or has not been established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuantityCode QuantityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity is unknown by the sender or has not been established."</li>
	 * </ul>
	 */
	public static final QuantityCode UnknownQuantity = new QuantityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnknownQuantity";
			definition = "Quantity is unknown by the sender or has not been established.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuantityCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Instruction applies to the entire eligible balance of underlying
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuantityCode QuantityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QALL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction applies to the entire eligible balance of underlying securities."
	 * </li>
	 * </ul>
	 */
	public static final QuantityCode AllSecurities = new QuantityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllSecurities";
			definition = "Instruction applies to the entire eligible balance of underlying securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuantityCode.mmObject();
			codeName = "QALL";
		}
	};
	/**
	 * Instruction applies to the entire eligible balance of underlying
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuantityCode QuantityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANYA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyAndAll"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction applies to the entire eligible balance of underlying securities."
	 * </li>
	 * </ul>
	 */
	public static final QuantityCode AnyAndAll = new QuantityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyAndAll";
			definition = "Instruction applies to the entire eligible balance of underlying securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuantityCode.mmObject();
			codeName = "ANYA";
		}
	};
	final static private LinkedHashMap<String, QuantityCode> codesByName = new LinkedHashMap<>();

	protected QuantityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OPEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuantityCode";
				definition = "Quantity is unknown by the sender or has not been established.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QuantityCode.Open, com.tools20022.repository.codeset.QuantityCode.UnknownQuantity, com.tools20022.repository.codeset.QuantityCode.AllSecurities,
						com.tools20022.repository.codeset.QuantityCode.AnyAndAll);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Open.getCodeName().get(), Open);
		codesByName.put(UnknownQuantity.getCodeName().get(), UnknownQuantity);
		codesByName.put(AllSecurities.getCodeName().get(), AllSecurities);
		codesByName.put(AnyAndAll.getCodeName().get(), AnyAndAll);
	}

	public static QuantityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QuantityCode[] values() {
		QuantityCode[] values = new QuantityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QuantityCode> {
		@Override
		public QuantityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QuantityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}